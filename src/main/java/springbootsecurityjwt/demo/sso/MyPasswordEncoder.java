package springbootsecurityjwt.demo.sso;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author yangkang
 * @date 2019-03-03 下午 09:18
 **/
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }

}
