/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fogtorch.application;

import fogtorch.utils.QoSProfile;

/**
 *
 * @author stefano
 */
public abstract class ThingRequirement {
    private QoSProfile q;
    
    public void setQ(QoSProfile q) {
        this.q = q;
    }

    public QoSProfile getQ() {
        return q;
    }
}
