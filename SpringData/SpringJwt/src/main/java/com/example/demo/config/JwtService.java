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

	private final String SECERT="";
	
	public String generateToken(String username) {
		Map<String, Object> claims= new HashMap();
		return createToken(username,claims);
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
