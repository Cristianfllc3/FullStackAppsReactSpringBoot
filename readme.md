**Building Full-Stack Apps with React and Spring  

**INITIAL SETUP (3 Hours)  
---------------  
Install->  
https://code.visualstudio.com/  
https://code.visualstudio.com/docs/java/java-spring-boot  
https://brew.sh/  
https://www.postman.com/  
https://nodejs.org/en/  
	npm -version  
	node -version  

**PROYECT (20 Minuts)  
---------  
1 - (generat proyect and export as zip file to import into Visual Studio Code)  
https://start.spring.io/  
	Dependencies  
		Rest repositories  
		Spring Data JPA  
		H2 Database  
		Lombok  
  
download the zip file and into visual studio code, open file to the extract folder and charge the proyect.  

2 - In Visual Studio Code, in the proyect folder, open the terminal and write:  
npx create-react-app client  
(the code create a folder into the proyect)  

notes:  
React App requires Node 10 or higher.   
	https://medium.com/stackfame/how-to-update-node-js-to-latest-version-linux-ubuntu-osx-windows-others-105749e90040  
Please update your version of Node  
	https://github.com/nvm-sh/nvm/blob/master/README.md#installing-and-updating  
nvm use 14.16.0  
  
**SPRING MODEL (30 Minuts)  
--------------  
tools: Visual Studio Code, Console, ..  
1 - Create the model  
See "class contact"  
  
2 - Create Repository to connect the model with the DB  
see "interface contactRepository"  
  
3 - Create a LoaderData if it is not DB  
See "class demoLoader"  

note: JPA (java persistent api).  

** HTTP WITH SPRING (30 Minuts)  
-------------------
tools:Visual Studio Code, Postman

Download Postman agent (local) to use web Postman workspace.  
(the local agent send info to the web workspace space)  

1 - Use a GET "http://localhost:8080/api" in your postman personal workspace.  
(You must see your api from your Spring proyect)  

2 - Use POST "http://localhost:8080/api"  
	Adjust in Headers Key: Contect-Type, Value: application/json  
	Adjust in Body select raw  

* Add data and send Post  
{  
"firstName": "otherfirstName",  
"lastName": "otherLastName",  
"email": "me2@me.ca"  
}  

3 - Use PUT "http://localhost:8080/api"  
	Adjust in Headers Key: Contect-Type, Value: application/json  
	Adjust in Body select raw  

Before do a PUT request you need to search the objet that is going to change.  
Get, select the link off the contact and change the url  

PUT "http://localhost:8080/api/contacts/3"  
{  
"firstName": "Isa",  
"lastName": "Bel",   
"email": "me3@me.ca"  
  }  

4 - Use DELETE "http://localhost:8080/api"  
Before do a DELETE request you need to search the objet that is going to change.  
Get, select the link off the contact and change the url  

DELETE "http://localhost:8080/api/contacts/4"  

**BASIC FRONTEND REACT  
---------------------  
1 - Open the terminal console into the Visual studio code, with the folder client selected  
"rigth click to the client folder and click on Open in integrated terminal"  

2 - npm start  
note: If your node is below 10, must change the version, nvm use 14.16.0 (version of node that use)  

3 - Edit src/App.js and save to reload.  

4 - Add materializex to the project  
https://materializecss.com/  
- Use in index.html client/public folder of the project, the code of CDN in getting started of materializec  
- Use in index.html client/public folder of the project, the code of Usage in commponent - icons of materializec  

For create other commponent "SingleContact.j"  
- Use in src/components folder of the project, the code of Usage in commponent - card of materializec  

5 - Add Controller CORS  
(If the backend is in different port thatn the frontend)  












