/*
 * Copyright(C) Triniforce
 * All Rights Reserved.
 *
 */ 
package com.triniforce.postoffice.intf;

import java.util.concurrent.Future;


public interface IPostMaster {
    Future post(StreetPath streetPath, String box, Object data);
    void stop(int waitMilliseconds);
}
