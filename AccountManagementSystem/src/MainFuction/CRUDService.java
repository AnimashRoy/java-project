package MainFuction;

import AccountSystem.AccountForm;

import java.util.ArrayList;

public class CRUDService {

    //Create
    public static void create(AccountForm account, ArrayList<AccountForm> db)
    {
        for(AccountForm Form: db)
        {
            if(account.id == Form.id)
            {
                System.out.println("Your Given ID Already Exist");
            }
        }
        db.add(account);
        System.out.println("Successfully Added Your ID\n");
    }

    //Read
    public static void read(int search_id, ArrayList<AccountForm> db)
    {
        for(AccountForm Form : db)
        {
            if(search_id == Form.id)
            {
                System.out.println("ID     :"+ Form.id);
                System.out.println("Name   :"+Form.name);
                System.out.println("Age    :"+Form.age);
                System.out.println("Gender : "+Form.gender);
                //System.out.println("Contact: "+Form.contact);
                //System.out.println("Address: "+Form.address);
                return;
            }
        }
        System.out.println("Account Form Not Found In Database");
    }

    //Update
    public static void update(AccountForm Form, ArrayList<AccountForm> db)
    {
        int update_form = 0;
        for(AccountForm account : db)
        {
            if(account.id == Form.id)
            {
                db.remove(update_form);
                db.add(Form);
                return;
            }
        }
        System.out.println("Your Given ID Not Found In Database");
    }

    // Delete
    public static void delete(int id, ArrayList<AccountForm> db)
    {
        int delete_id = 0;
        for(AccountForm Form : db)
        {
            if(Form.id == id)
            {
                db.remove(delete_id);
                System.out.println("ID Successfully Deleted");
                return;
            }
        }
        delete_id++;
        System.out.println("ID not Found In Database");
    }
}
