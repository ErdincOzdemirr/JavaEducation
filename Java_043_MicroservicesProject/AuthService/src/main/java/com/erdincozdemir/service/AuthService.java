package com.erdincozdemir.service;

import com.erdincozdemir.dto.request.DoLoginRequestDto;
import com.erdincozdemir.dto.request.DoRegisterRequestDto;
import com.erdincozdemir.model.Auth;
import com.erdincozdemir.repository.IAuthRepository;
import com.erdincozdemir.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService extends ServiceManager<Auth, Long> {

  // @Autowired
    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Auth doRegister(DoRegisterRequestDto dto) {

        System.out.println("DoRegisterRequestDto: " +  dto);

        // TODO  Exception
        //if (repository.existsByUsername(dto.getUsername()))
        //    throw new Exception()

        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());

        // TODO password rePassword
        auth.setPassword(dto.getPassword());
        auth.setEmail(dto.getEmail());
        auth.setCreateAt(System.currentTimeMillis());
        auth.setState(true);

        save(auth);
        System.out.println("auth: " +  auth);

        return auth;
    }


    public String doLogin1(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());

      //  if (auth.isEmpty())
            // TODO execption


        return auth.get().getId().toString();
    }


    public Auth doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findOptionalByUsernameAndPassword(dto.getUsername(), dto.getPassword());

        //  if (auth.isEmpty())
        // TODO execption


        return auth.get();
    }


}
