/*
 * Copyright(C) Triniforce
 * All Rights Reserved.
 *
 */ 
package com.triniforce.messagebus;

import java.util.List;

public interface IBusElement {
    
    void handleMessage(BusEvent msg, List<BusMsg> out);

}
