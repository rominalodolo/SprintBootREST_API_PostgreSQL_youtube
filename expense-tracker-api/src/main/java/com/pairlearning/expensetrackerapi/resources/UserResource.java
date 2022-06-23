package com.pairlearning.expensetrackerapi.resources;

//import com.pairlearning.expensetrackerapi.Constants;
//import com.pairlearning.expensetrackerapi.domain.User;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.Date;
//import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, Object> userMap){
        String firstName = (String) userMap.get("firstName");
        String lastName = (String) userMap.get("lastName");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        return firstName + ", " + lastName + ", " + email + ", " + password;
    }

//    private Map<String, String> generateJWTToken(User user){
//        long timestamp = System.currentTimeMillis();
//        String token = Jwts.builder().signWith(SignatureAlgorithm.HS256, Constants.API_SECRET_KEY)
//                .setIssuedAt(new Date(timestamp))
//                .setExpiration(new Date(timestamp + Constants.TOKEN_VALIDITY))
//                .claim("userId", user.getUserId())
//                .claim("email", user.getEmail())
//                .claim("firstName", user.getFirstName())
//                .claim("lastName", user.getLastName())
//                .compact();
//        Map<String, String> map = new HashMap<>();
//        map.put("token", token);
//        return map;
//    }
}
