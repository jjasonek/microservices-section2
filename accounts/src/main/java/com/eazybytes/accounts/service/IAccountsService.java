package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - {@link CustomerDto} Object
     */
    void createAccount(CustomerDto customerDto);

}
