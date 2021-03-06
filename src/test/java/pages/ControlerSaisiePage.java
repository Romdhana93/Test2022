package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlerSaisiePage {

	public WebDriver driver;
	private JavascriptExecutor js;
	private String baseUrl;

	public By nomSaisie = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/div/div/div/span/input");
	public By chercherEntreprise = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-reference-society/div/app-api-siren/div/div/div/div[3]/form/div/div[2]/div/div[3]/button/span[2]");
	public By ajout1Entrprise = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-reference-society/div/app-api-siren/div/div/div/div[3]/p-treetable/div/div/table/tbody/tr[1]");
	public By ajout2Entrprise = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-reference-society/div/app-api-siren/div/div/div/div[3]/p-treetable/div/div/table/tbody/tr[5]");
	public By choisirEntRef = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-reference-society/div/app-api-siren/div/div/div/div[1]/p-table/div/div/table/tbody/tr/td[10]/fieldset/label/span");
	public By ongletApporteur = By.xpath("//span[normalize-space()='Apporteur - interlocuteur - inspecteur']");
	public By codeApporteur = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-apporteur-inspecteur/p-tabview/div/div/p-tabpanel[1]/div/div/form/div/div[5]/div[2]/div/div/div/p-dropdown/div/div[3]/input");
	public By searchcodeApporteur = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-apporteur-inspecteur/p-tabview/div/div/p-tabpanel[1]/div/div/form/div/div[5]/div[2]/div/div/p-button/button/i");
	public By nomInterlocuteur = By
			.xpath("//*[@id=\"ui-tabpanel-8\"]/div/form/div/div[2]/div[1]/div/div/div/p-dropdown/div/div[3]");
	public By choisirInterlocuteur = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[2]/li/span");
	public By chercherSirenApport = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-apporteur-inspecteur/p-tabview/div/div/p-tabpanel[1]/div/div/form/div/div[6]/div[8]/div/div/p-button/button/i");
	public By choisirSirenApport = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[2]/div/app-apporteur-inspecteur/p-tabview/div/div/p-tabpanel[1]/div/div/form/div/div[7]/p-treetable/div/div/table/tbody/tr");
	public By ongletDescrProj = By.xpath("//span[normalize-space()='Descriptif du projet']");
	public By choixPrev = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[2]/div/p-checkbox/div/div[2]");
	public By choixSante = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[3]/div/p-checkbox/div/div[2]");
	public By offreRetenu = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[6]/div/div/p-dropdown/div/div[4]/span");
	public By orSim_G = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[2]/li");
	public By or20_300 = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[1]/li");
	public By orSim_k = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[3]/li");
	public By offrePreconise = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[7]/div/div/p-dropdown/div/div[3]");
	public By oprSim_G = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[2]/li");
	public By opr20_300 = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[1]/li");
	public By oprSim_k = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[3]/li");
	public By regime = By.xpath(
			"//*[@id=\"ui-tabpanel-5\"]/app-projet-description/app-offre-description/div/form/div/div/div[9]/div/div/p-dropdown/div/div[4]/span");
	public By rFacultatif = By.xpath("//span[normalize-space()='Facultatif']");
	public By rObligatoire = By.xpath("//span[normalize-space()='Obligatoire']");
	public By offrDedSurMesur = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[11]/div/p-checkbox/div/div[2]");
	public By NomoffrDedSurMesur = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[12]/div/input");
	public By appelOffrMarchPup = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[14]/div/p-checkbox/div/div[2]");
	public By risqStatut = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[15]/div/p-checkbox/div/div[2]");
	public By complStatut = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[16]/div/p-checkbox/label");
	public By upploadOffrMarchPubliq = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-offre-description/div/form/div/div/div[17]/div/div/div/input");
	public By dossierComplex = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-dossier-complexe/div/form/div/div/div/div/p-checkbox/div/div[2]");
	public By typeDossierComplex = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-dossier-complexe/div/form/div/div[1]/div[2]/div/div/p-dropdown/div/div[3]");
	public By internationalDossierComplex = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[2]/li");
	public By xlDossierComplex = By.xpath("/html/body/div/div[2]/ul/p-dropdownitem[1]/li/span");
	public By cadreColleg = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-entreprise-description/div/form/div/div/div[2]/div/p-checkbox[2]/div/div[2]");
	public By ensPersonColleg = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-entreprise-description/div/form/div/div/div[2]/div/p-checkbox[1]/div/div[2]");
	public By effectifEntrep = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-entreprise-description/div/form/div/div/div[4]/div/input");
	public By commentair = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-entreprise-description/div/form/div/div/div[5]/p-fieldset/fieldset/div/div/div/div[2]/input");
	public By submitCommentair = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-entreprise-description/div/form/div/div/div[5]/p-fieldset/fieldset/div/div/div/div[2]/button/i");
	public By uploadSaisiApport = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[3]/div/app-projet-description/app-entreprise-description/div/form/div/div/div[6]/div/div/div/input");
	public By sauvegardeSaisie = By.xpath(
			"/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/div/div[3]/p-button[1]/button/span");
	public By popUpSauvegSucess = By
			.xpath("/html/body/app-root/app-home/div/app-body/app-message/p-toast/div/p-toastitem/div/div/div/div[2]");

	public By ongletSyntheseSaisie = By.xpath("/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/ul/li[4]/a/span");
	
	public By controlerSaisie = By.xpath("/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[4]/div/app-validation-sasie/app-screen/app-footer-screen/div/div/p-button/button/span");
	
	public By popUpControlerSaisie = By.xpath("/html/body/app-root/app-home/div/app-body/app-message/p-toast/div/p-toastitem/div/div/div/div[2]");
	
	
	
	public ControlerSaisiePage(WebDriver driver) {
		this.driver = driver;
	}

	public void ongletSocietDeRefference() {
		js = (JavascriptExecutor) driver;

		WebElement searchentreprise = driver.findElement(chercherEntreprise);

		// Si localisateur ne fonctionnent pas comme pr??vu, vous pouvez utiliser
		// JavaScriptExecutor pour effectuer l'op??ration souhait??e sur le
		// WebElement.."executeScript: ex??cute le script"
		js.executeScript("arguments[0].click()", searchentreprise);

		driver.findElement(ajout1Entrprise).click();
		driver.findElement(ajout2Entrprise).click();
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/app-root/app-home/div/app-body/app-saisie/p-tabview/div/div/p-tabpanel/div/p-tabview/div/div[2]/p-tabpanel[1]/div/app-reference-society/div/app-api-siren/div/div/div/div[3]/p-treetable/div/div/table/tbody/tr[8]"
		 * )) .click(); ===>ajout 3 entrep
		 */
		driver.findElement(choisirEntRef).click();

	}

	public void ongletApporteur() {

		driver.findElement(ongletApporteur).click();// onglet appor

		driver.findElement(codeApporteur).sendKeys("q1041");// code apporteur

		driver.findElement(searchcodeApporteur).click();// search code apporteur

		driver.findElement(nomInterlocuteur).click();// Nom interlocuteru

		driver.findElement(choisirInterlocuteur).click();// choisir interloc

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		WebElement inputSirneApporteur = driver.findElement(By.xpath(
				"//*[@id=\"ui-tabpanel-8\"]/div/form/div/div[6]/div[8]/div/div/div/p-dropdown/div/div[3]/input"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		wait.until(ExpectedConditions.attributeContains(inputSirneApporteur, "aria-label", "402051239"));

		driver.findElement(chercherSirenApport).click();// search-Siren-APP

		driver.findElement(choisirSirenApport).click(); // Siret-Rs-apporteur
	}

	public void descreptifProjet() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		driver.findElement(ongletDescrProj).click();// ONGLET dEScrip

		driver.findElement(choixPrev).click();// case Prev

		driver.findElement(offreRetenu).click(); // offre retenu
		// driver.findElement(orSim_G).click();// offre retenu = sim-G
		driver.findElement(or20_300).click();// offre retenu = 20-300
		// driver.findElement(orSim_k).click();//offreretenu = sim-K

		driver.findElement(offrePreconise).click();// offre pr??conis??
		
		wait.until(ExpectedConditions.visibilityOfElementLocated((oprSim_k)));// waitfor offre preconnis?? = sim-K
		driver.findElement(oprSim_k).click(); // offrepreconnis?? = sim-K

		

		driver.findElement(regime).click();// r??gime
		driver.findElement(rObligatoire).click();// 

		driver.findElement(offrDedSurMesur).click();// ofre d??di?? sur mesur

		driver.findElement(NomoffrDedSurMesur).sendKeys("Test");// nom de l'offre d??dier sur mesur

		driver.findElement(appelOffrMarchPup).click();// Appel d'offre march?? public

		wait.until(ExpectedConditions.visibilityOfElementLocated((complStatut)));// wait for compl statutaire toshow


		 driver.findElement(complStatut).click();//Compl??ment statutaire

		// Uplode file : champ Appel d'offre march?? public

		WebElement browse = driver.findElement(upploadOffrMarchPubliq);// champ parcourir
		// click on ???Choose file??? to upload the desired file
		browse.sendKeys("C:\\Users\\msromdhana\\Downloads\\TP3_RpmdhanaMedSalah.pdf"); // Uploading the file using
																						// sendKeys

		
	
		driver.findElement(cadreColleg).click();;// Coll??ge= cadre
		driver.findElement(effectifEntrep).sendKeys("450");// Effectif de l'entreprise

		driver.findElement(commentair).sendKeys("RAS");// commentaire
		driver.findElement(submitCommentair).click();// Submit commentaire

		WebElement browse2 = driver.findElement(uploadSaisiApport);// champ parcourir
		// click on ???Choose file??? to upload the desired file
		browse2.sendKeys("C:\\Users\\msromdhana\\Downloads\\TP3_RpmdhanaMedSalah.pdf"); // Uploading the file using
																						// sendKeys

	}
	
	

}
