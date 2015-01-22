${app}: 始めに
-----------------------------------
Java Web スターター・アプリケーションへようこそ

このサンプル・アプリケーションでは、Java Web アプリケーション (WebSphere Liberty 対応) を作成する方法、およびそれを Bluemix にデプロイする方法を示します。

1. [cf コマンド・ライン・ツールをインストールします](${doc-url}/#starters/BuildingWeb.html#install_cf)。
2. [スターター・アプリケーション・パッケージをダウンロードします](${ace-url}/rest/apps/${app-guid}/starter-download)。
3. パッケージを解凍し、そのパッケージに `cd` で移動します。
4. Bluemix への接続:

		cf api ${api-url}

5. Bluemix へのログイン:

		cf login -u ${username}
		cf target -o ${org} -s ${space}
				
6. Java コードをコンパイルし、Eclipse または Ant を使用して war パッケージを生成します。
7. アプリのデプロイ:

		cf push ${app} -p webStarterApp.war

8. アプリへのアクセス: [http://${route}](http://${route})
9. また、スターター・アプリケーション・パッケージを Eclipse にインポートすること、および [IBM Eclipse Tools for Bluemix を使用してデプロイ](${doc-url}/#manageapps/eclipsetools.html#eclipsetools)することができます。
