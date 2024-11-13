package top.gsc.service;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.Collection;

public interface UserDetails extends Serializable {
    // 授权信息集合
    Collection<? extends GrantedAuthority> getAuthorities();
    // 获取密码
    String getPassword();
    // 获取用户名
    String getUsername();
    // 用户的帐户是否未过期。即未过期则返回true
    boolean isAccountNonExpired();
    // 用户是否未锁定。无法对锁定的用户进行身份验证，如果用户未被锁定，则返回true
    boolean isAccountNonLocked();
    // 用户的凭据（密码）是否未过期，即未过期则返回true
    boolean isCredentialsNonExpired();
    // 用户是启用还是禁用，如果启用了用户则返回true
    boolean isEnabled();
}
