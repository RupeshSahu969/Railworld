package com.example.demo.config;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;


@Component
public class JwtService {
	
	
	  private final String SECERT = "nmFWroAYa4iKNJVIcNXskEQGVfStrH+m71f1w9i2q7w4seKlMnf9pHHwQbE7pxUC8UXZNnfjXJgtHy04B/SzEcaUfLOyw5ApL/6v319BfsoXtfxMhzgcmZSBNTjdt+Uq1n4C8BAXCT0p7U9bsUz0wvbAkuZn68gVlV3ndJ+AI7QzSIVMe1t6Z34yOSpcP0oZyqqDWWfnJORd3Xocz25S+WfP2mORmg5yxSBjr32rFPFmnxPwUtaJ27mDqoJ477ukWLWGrd9lOceELOVaRXecNvh1ObaWct7TijuqQZIp3XoI28ZZSGrihck2afnz2VdQDxBe89DgClbaxjZf5XvzCw==";
		
	    public String generateToken(String username) {
	    	  Map<String, Object> claims = new HashMap();
	    	return createToken(username, claims);
	    }
	    
	    
	   


		private String createToken(String username, Map<String, Object> claims) {
			// TODO Auto-generated method stub
			return Jwts
					.builder()
					.setClaims(claims)
					.setSubject(username)
					.setIssuedAt(new Date(System.currentTimeMillis()))
					.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
					.signWith(getSignKey(), SignatureAlgorithm.HS256)
					.compact();
		}





		private Key getSignKey() {
			// TODO Auto-generated method stub
			     byte[] keyCodes =    Decoders.BASE64.decode(SECERT);
			return Keys.hmacShaKeyFor(keyCodes);
		}

	
}
