package de.ostfale.base.annotations;

import java.lang.reflect.Method;

/**
 * Main application class which uses reflection to find annotations an read its values
 * Created :  05.09.2019
 *
 * @author : Uwe Sauerbrei
 */
public class MainApp {

    public static void main(String[] args) {
        getTodoReportForBusinessLogic();
    }

    /**
     * This method iterates through all messages of BusinessLogic class and fetches annotations defined on each of them.
     * After that it displays the information from annotation accordingly.
     */
    private static void getTodoReportForBusinessLogic() {
        Class businessLogicClass = BusinessLogic.class;
        for (Method method : businessLogicClass.getMethods()) {
            Todo todoAnnotation = (Todo) method.getAnnotation(Todo.class);
            if (todoAnnotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" Author : " + todoAnnotation.author());
                System.out.println(" Priority : " + todoAnnotation.priority());
                System.out.println(" Status : " + todoAnnotation.status());
                System.out.println(" --------------------------- ");
            }
        }
    }
}
