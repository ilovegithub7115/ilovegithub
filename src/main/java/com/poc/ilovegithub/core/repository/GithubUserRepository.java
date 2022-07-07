package com.poc.ilovegithub.core.repository;

import com.poc.ilovegithub.core.domain.GithubUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GithubUserRepository extends JpaRepository<GithubUser, Integer> {

    @Query("select max(g.git_id) from GithubUser g")
    String findMaxGitId();
}
