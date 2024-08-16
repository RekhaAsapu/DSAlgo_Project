package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TreePage extends BasePage {

	public TreePage(WebDriver driver)
	{
			super(driver);
		if (this.driver == null) {
            throw new IllegalArgumentException("hello WebDriver cannot be null");
        }

	}
	
	@FindBy(xpath="//a[text()='Overview of Trees']")
	private static WebElement OverviewofTrees;
	
//	public void clickonOverviewofTrees()
//	{
//		OverviewofTrees.click();
//	}
	
	@FindBy(xpath="//a[text()='Terminologies']")
	private static WebElement Terminologies;
	
//	public void clickonTerminologies()
//	{
//		Terminologies.click();
//	}
//	
	
	@FindBy(xpath="//a[text()='Types of Trees']")
	private static WebElement TypesofTrees;
//	public void clickonTypesofTrees()
//	{
//		TypesofTrees.click();
//	}
//	
	@FindBy(xpath="//a[text()='Tree Traversals']")
	private static WebElement TreeTraversals;
//	public void clickonTreeTraversals()
//	{
//		TreeTraversals.click();
//	}
	
	@FindBy(xpath="//a[text()='Traversals-Illustration']")
	private static WebElement TraversalsIllustration;
//	public void clickonTraversalsIllustration()
//	{
//		TraversalsIllustration.click();
//	}
	
	@FindBy(xpath="//a[text()='Binary Trees']")
	private static WebElement BinaryTrees;
//	public void clickonBinaryTrees()
//	{
//		BinaryTrees.click();
//	}
	
	@FindBy(xpath="//a[text()='Types of Binary Trees']")
	private static WebElement TypesofBinaryTrees;
//	public void clickonTypesofBinaryTrees()
//	{
//		TypesofBinaryTrees.click();
//	}
	
	@FindBy(xpath="//a[text()='Implementation in Python']")
	private static WebElement ImplementationinPython;
//	public void clickonImplementationinPython()
//	{
//		ImplementationinPython.click();
//	}
//	
	@FindBy(xpath="//a[text()='Binary Tree Traversals']")
	private static WebElement BinaryTreeTraversals;
//	public void clickonBinaryTreeTraversals()
//	{
//		BinaryTreeTraversals.click();
//	}
	
	@FindBy(xpath="//a[text()='Implementation of Binary Trees']")
	private static WebElement ImplementationofBinaryTrees;
//	public void clickonImplementationofBinaryTrees()
//	{
//		ImplementationofBinaryTrees.click();
//	}
//	
	@FindBy(xpath="//a[text()='Applications of Binary trees']")
	private static WebElement ApplicationsofBinarytrees;
//	public void clickonApplicationsofBinarytrees()
//	{
//		ApplicationsofBinarytrees.click();
//	}

	@FindBy(xpath="//a[text()='Binary Search Trees']")
	private static WebElement BinarySearchTrees;
//	public void clickonBinarySearchTrees()
//	{
//		BinarySearchTrees.click();
//	}

	@FindBy(xpath="//a[text()='Implementation Of BST']")
	private static WebElement ImplementationOfBST;
	//public void clickonImplementationOfBST()
//	{
//		ImplementationOfBST.click();
//	}
	@FindBy(xpath="//a[contains(text(),'Try here')]")
	private static WebElement tryherebutton;
	//public void clickontryherebutton() throws InterruptedException
//	{
//		Thread.sleep(90000);
//		tryherebutton.click();
//	}
	@FindBy(xpath="//a[@href='/tree/practice']")
	private static WebElement practicelink;
	
//	public void clickonpracticelink()
//	{
//		practicelink.click();
//	}

	public String gettreepageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
		
	}
	
	public void clickonlink(String nameoflink) {
        switch (nameoflink) {
            case "Overview of Trees":
            	OverviewofTrees.click();
                break;
            case "Terminologies":
            	Terminologies.click();
                break;
            case "Types of Trees":
            	TypesofTrees.click();
                break;
            case "Tree Traversals":
            	TreeTraversals.click();
                break;  
                case "Traversals-Illustration":
                	TraversalsIllustration.click();
                    break;
                case "Binary Trees":
                	BinaryTrees.click();
                    break;
                case "Types of Binary Trees":
                	TypesofBinaryTrees.click();
                    break;
                case "Implementation in Python":
                	ImplementationinPython.click();
                    break;
                case "Binary Tree Traversals":
                	BinaryTreeTraversals.click();
                    break;
                case "Implementation of Binary Trees":
                	ImplementationofBinaryTrees.click();
                    break;
                case "Applications of Binary trees":
                	ApplicationsofBinarytrees.click();
                    break;
                case "Binary Search Trees":
                	BinarySearchTrees.click();
                    break;
                case "Implementation Of BST":
                	ImplementationOfBST.click();
                    break;
                case "Try Here":
                	tryherebutton.click();
                	break;
                case "Practice Questions":
                practicelink.click();
                break;
                
                    
            // Add more cases as needed
            default:
                throw new IllegalArgumentException("No such link: " + nameoflink);
        }
	}
}
