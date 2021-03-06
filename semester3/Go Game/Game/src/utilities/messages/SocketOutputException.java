/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.messages;

import java.io.Serializable;

/**
 *
 * @author n1t4chi
 */
public class SocketOutputException extends SocketError{
    
    /**
     * Default constructor.
     * @param Error Exception which lead to creation of this message.
     */
    public SocketOutputException(Exception Error) {
        super(Error);
    }


    @Override
    public MessageType getMessageType() {
        return MessageType.SOCKET_OUTPUT_ERROR;
    }
    
}
