package com.devoops.service.custuser;

import com.devoops.domain.CustUser;

public interface CustUserService {

    void userSave(CustUser custuser);
    
    CustUser searchCustUser(String userId, String userPw);
    
    CustUser searchCustUSer(String userId);
}
