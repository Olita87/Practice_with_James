package OOP;

public interface WebElement {
    /*
    create an interface WebElement
    create abstract methods:
        void click()
        String getText()
        void sendKeys(String txt)

create a class Link
    implement the WebElement interface and implement all abstract methods

create a class Input
    implement the WebElement interface and implement all abstract methods

create a class WebDriverUtil
    create a method called clickElement that is accept the WebElement type and calls the click method from those object

create a runner class to create objects of Link and Input with a focus on the interface references

bonus to try/think about, we will do example on the weekend:

    array or ArrayList of these objects that are similar
    looping those objects
     */

    abstract void click();
    abstract String getText();
    abstract void sendKeys(String text);


}
