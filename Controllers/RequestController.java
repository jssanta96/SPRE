package Controllers;

import Dao.RequestDao;
import Logica.Request;

public class RequestController {
    RequestDao requestDao;

    public RequestController(){
        requestDao= new RequestDao();
    }

    public int addRequest(String request_id, String state, String user_id, String serial, String start_date, String end_date){
        Request request= new Request();

        request.setRequest_id(request_id);
        request.setState(state);
        request.setUser_id(user_id);
        request.setSerial(serial);
        request.setStart_date(start_date);
        request.setEnd_date(end_date);

        System.out.println("Se va a insertar una Solicitud");

        int result=requestDao.saveRequest(request);

        System.out.println("Se inserto una nueva solicitud");

        return result;

    }

    public Request viewRequest(String request_id){

        Request request = new Request();

        System.out.println("Se va a consultar una solicitud");

        request = requestDao.viewRequest(request_id);

        return request;

    }

    public void updateRequest(String request_id, String state, String user_id, String serial, String start_date, String end_date){
        requestDao.updateRequest(request_id,state,user_id,serial,start_date,end_date);
    }

    public void deleteRequest(String request_id){
        requestDao.deleteRequest(request_id);
    }
}