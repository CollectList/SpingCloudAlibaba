package xyz.yangweixing.nacos.gateway.filter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 描述
 *
 * @author weixing.yang
 * @version 1.1.0
 * @date 2019/11/29 9:57
 */
public class JwtUtil {

    public static final String SECRET = "qazwsx123444$#%#()*&& asdaswwi1235 ?;!@#kmmmpom in***xx**&";
    public static final String TOKEN_PREFIX = "Bearer_";
    public static final String HEADER_AUTH = "Authorization";

    public static String generateToken(String user) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", new Random().nextInt());
        map.put("user", user);
        String jwt = Jwts.builder()
                .setSubject("user info").setClaims(map)
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        String finalJwt = TOKEN_PREFIX + jwt;

        return finalJwt;
    }

    public static Map<String, String> validateToken(String token) {

        if(token != null){
            HashMap<String, String> map = new HashMap<>();
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody();
            String id = String.valueOf(body.get("id"));
            String user = (String) body.get("user");
            map.put("id", id);
            map.put("user", user);
            if(StringUtils.isEmpty(user)){
                throw  new RuntimeException("user is error~~~");
            }
            return map;
        }else {
            throw  new RuntimeException("token is error~~~");
        }
    }
}
