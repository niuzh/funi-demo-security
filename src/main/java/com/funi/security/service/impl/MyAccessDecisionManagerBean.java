package com.funi.security.service.impl;

import com.funi.security.mbg.dao.AuthorityMapper;
import com.funi.security.mbg.dao.AuthorityResourceRelMapper;
import com.funi.security.mbg.dao.ResourceMapper;
import com.funi.security.mbg.dto.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.FilterInvocation;

import java.util.*;

/**
 * @author zhihuan.niu on 7/20/17.
 */
public class MyAccessDecisionManagerBean implements AccessDecisionManager, InitializingBean {
    @Autowired
    private AuthorityMapper authorityMapper;
    @Autowired
    private AuthorityResourceRelMapper authorityResourceRelMapper;
    @Autowired
    private ResourceMapper resourceMapper;
    //权限-资源
    private static Map<Resource, List<String>> resourceMap = new HashMap<Resource, List<String>>();

    public void afterPropertiesSet() {
        List<Resource> resourceList=resourceMapper.selectByExample(new ResourceExample());
        List<Authority> authorityList=authorityMapper.selectByExample(new AuthorityExample());
        List<AuthorityResourceRel> authorityResourceRelList=authorityResourceRelMapper.selectByExample(new AuthorityResourceRelExample());
        for (Resource resource:resourceList){
            if(resource.getIsDeleted())continue;
            List<String> authorityKey = new ArrayList<String>();
            for (AuthorityResourceRel authorityResourceRel:authorityResourceRelList){
                if(authorityResourceRel.getIsDeleted())continue;
                if(authorityResourceRel.getResourceId().equals(resource.getId())){
                    for (Authority authority:authorityList){
                        if(authority.getIsDeleted())continue;
                        if(authorityResourceRel.getAuthorityId().equals(authority.getId())){
                            authorityKey.add(authority.getKeyValue());
                            break;
                        }
                    }
                }
            }
            resourceMap.put(resource, authorityKey);
        }
    }

    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        //当前用户的权限
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        if (o instanceof FilterInvocation) {
            FilterInvocation filterInvocation = (FilterInvocation) o;
            Set<String> set = findAuthorityKeyValue(filterInvocation);
            for (GrantedAuthority authority : authorities) {
                if (set.contains(authority.getAuthority())) {
                    return;
                }
            }
        }
        throw new AccessDeniedException("Access is denied");
    }

    private Set<String> findAuthorityKeyValue(FilterInvocation filterInvocation) {
        Set<String> set = new HashSet<String>();
        for (Map.Entry<Resource, List<String>> entry : resourceMap.entrySet()) {
            String url = filterInvocation.getRequestUrl();
            String method = filterInvocation.getRequest().getMethod();
            if (entry.getKey().getResource().equals(url)){
                set.addAll(entry.getValue());
            }
        }
        return set;
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
