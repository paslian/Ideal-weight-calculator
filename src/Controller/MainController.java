/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Project.IdealOld;
import Query.MainQuery;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hp
 */
public class MainController extends BaseController {
        MainQuery query = new MainQuery();
    
    public boolean create(IdealOld model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getBb());
        map.put(2, model.getTb());
        map.put(3, model.getGender());
        map.put(4, model.getResult());
        map.put(5, model.getAdmin());
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
}
