開始使用 ${app}
-----------------------------------
歡迎使用 Java Web Starter 應用程式！

這個範例應用程式示範如何撰寫 Java Web 應用程式（採用 WebSphere Liberty 技術），並在 Bluemix 上部署它。

1. [安裝 cf 指令行工具](${doc-url}/#starters/BuildingWeb.html#install_cf)。
2. [下載入門範本應用程式套件](${ace-url}/rest/apps/${app-guid}/starter-download)。
3. 解開套件並 `cd` 到該處。
4. 連接至 Bluemix：

		cf api ${api-url}

5. 登入 Bluemix：

		cf login -u ${username}
		cf target -o ${org} -s ${space}
				
6. 編譯 Java 程式碼並使用 Eclipse 或 ant 產生 war 套件。
7. 部署您的應用程式：

		cf push ${app} -p webStarterApp.war

8. 存取您的應用程式：[http://${route}](http://${route})
9. 您也可以將入門範本應用程式套件匯入至 Eclipse，並[使用 IBM Eclipse Tools for Bluemix 進行部署](${doc-url}/#manageapps/eclipsetools.html#eclipsetools)。
