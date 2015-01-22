Einführung in ${app}
-----------------------------------
Willkommen bei der Java Web Starter-Anwendung!

Bei dieser Beispielanwendung wird veranschaulicht, wie eine Java-Webanwendung (eine WebSphere Liberty-Lösung) geschrieben und in Bluemix implementiert wird.

1. [Das Befehlszeilentool 'cf' installieren](${doc-url}/#starters/BuildingWeb.html#install_cf).
2. [Das Starteranwendungspaket herunterladen](${ace-url}/rest/apps/${app-guid}/starter-download).
3. Das Paket extrahieren und nach `cd` wechseln.
4. Verbindung zu Bluemix herstellen:

		cf api ${api-url}

5. Bei Bluemix anmelden:

		cf login -u ${username}
		cf target -o ${org} -s ${space}
				
6. Java-Code kompilieren und WAR-Paket mit Eclipse oder 'ant' generieren.
7. Ihre Anwendung (App) bereitstellen:

		cf push ${app} -p webStarterApp.war

8. Auf Ihre Anwendung (App) zugreifen: [http://${route}](http://${route})
9. Sie können das Starteranwendungspaket auch in Eclipse importieren und [mithilfe von IBM Eclipse Tools for Bluemix implementieren](${doc-url}/#manageapps/eclipsetools.html#eclipsetools).
