package de.ostfale.base.annotations;

/**
 * Implementation of the business logic used by this annotation
 * Created :  05.09.2019
 *
 * @author : Uwe Sauerbrei
 */
public class BusinessLogic {

    @Todo(priority = Todo.Priority.MEDIUM, author = "ostfale", status = Todo.Status.STARTED)
    public void incompleteMethod() {
        System.out.println("This method started some business logic but is not complete yet...");
    }

    @Todo(priority = Todo.Priority.LOW, status = Todo.Status.STARTED)
    public void anotherIncompleteMethod() {
        System.out.println("This is another incomplete method...");
    }

    public void completedMethod() {
        System.out.println("This method is complete");
    }

    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStartedMethod() {
        System.out.println("Method has not yet started...");
    }
}
