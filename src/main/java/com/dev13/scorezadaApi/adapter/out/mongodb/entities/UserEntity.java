package com.dev13.scorezadaApi.adapter.out.mongodb.entities;

import com.dev13.scorezadaApi.adapter.out.mongodb.entities.auditor.Auditor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@Document("users")
public class UserEntity extends Auditor {

    private String name;
    private String nickname;
    private String email;
    private String cpf;
    //private Set<Role> roles;
    //private Set<BettingPool> joinedBettingPools;
    //private Set<BettingPool> createdBettingPools;
    //private Set<Guess> guesses;
}
