/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm Exam
 * @author srinivsi
 */
public class StausUser 
{
   public enum StatusDetail
{    
       REJECTED,
       PENDING,
       PROCESSING,
       APPROVED   
};
 private StatusDetail statusDetail;

    /**
     * @return the statusDetail
     */
    public StatusDetail getStatusDetail() {
        return statusDetail;
    }

    /**
     * @param statusDetail the statusDetail to set
     */
    public void setStatusDetail(StatusDetail statusDetail) {
        this.statusDetail = statusDetail;
    }
 
}
