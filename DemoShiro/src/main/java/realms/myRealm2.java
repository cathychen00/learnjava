package realms;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Created by 陈敬 on 17/9/6.
 */
public class myRealm2 implements Realm {
    public String getName() {
        return "myRealm2";
    }

    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username=(String)token.getPrincipal();
        String password=new String((char[])token.getCredentials());

        if(!username.equals("admin")){
            throw new UnknownAccountException();
        }

        if(!password.equals("123456")){
            throw new IncorrectCredentialsException();
        }

        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
