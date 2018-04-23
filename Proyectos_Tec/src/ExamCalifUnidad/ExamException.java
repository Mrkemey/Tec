/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamCalifUnidad;

/**
 *
 * @author jmanu
 */
public class ExamException extends Exception {

    /**
     * Creates a new instance of <code>ExamException</code> without detail
     * message.
     */
    public ExamException() {
    }

    /**
     * Constructs an instance of <code>ExamException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ExamException(String msg) {
        super(msg);
    }
}
