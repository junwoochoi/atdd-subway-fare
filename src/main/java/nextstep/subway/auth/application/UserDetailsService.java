package nextstep.subway.auth.application;

public interface UserDetailsService {
    UserDetails loadUserByUsername(String principal);

    UserDetails emptyMember();
}