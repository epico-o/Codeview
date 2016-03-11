Codeview
-------------

Codeview is a android library tha lets you
preview code in webview very easy and simple with highlighs and colors.
With styles to chooses and language.
Also you can inject html and text into webview or any extended webview class.

This library was inspired and is working thanks to [highlight.js](https://highlightjs.org/).


Usage
-----

##### Codeview


1) Get a reference to your WebView or MyCustomWebView

```java
WebView webview = (WebView) findViewById(R.id.webview);
//set settings here
```

2) Basic usage. Default style is Original, and default language is java.

```java
//your string code 
String code = "public static void main(String[] args) { \n" +
                "\n" +
                "//comments\n" +
                "   for(int i =0; i < 10; i++) {\n" +
                "       addnum();\n" +
                "   }\n" +
                "\n" +
                "}\n";
								
Codeview.with(getApplicationContext)
		.withCode(code)
		.into(webview);
```


3) set style and language.

```java
MyTouchWebView webview = (MyTouchWebView) findViewById(R.id.mytouchwebview);
//set settings here
```

```java
//your string java code 
String code = "public static void main(String[] args) { \n" +
                "\n" +
                "//comments\n" +
                "   for(int i =0; i < 10; i++) {\n" +
                "       addnum();\n" +
                "   }\n" +
                "\n" +
                "}\n";
								
Codeview.with(getApplicationContext)
		.withCode(code)
		.setStyle(Settings.WithStyle.DARKULA)
        .setLang(Settings.Lang.JAVA)
		.into(webview);
```


4) Inject html head content and text.

```java
WebView webview = (WebView) findViewById(R.id.webview);
//set settings here
```

```java
//your string javascript code 
String code = "function addSum(n) {	\n" +
				"	//javascript function \n" +
				"	return ++n; \n"+
				} \n";
								
Codeview.with(getApplicationContext)
		.withCode(code)
		.setHtmlHeadContent("<style> table {" +
                        " border: 1px solid black;" +
                        " }" +
                        "" +
                        "</style>")
		.withHtml("<table><tr><td> my html table </td></tr></table>")
		.withText("this is text is always wrap inside pre tags")
		.setStyle(Settings.WithStyle.DARKSTYLE)
        .setLang(Settings.Lang.JAVASCRIPT)
		.setAutoWrap(true)
		.into(webview);
```



Sample App , coming soon
----------

Download , coming soon
--------

```groovy
compile coming soon
```

License
-------

    Copyright 2016 Avraam Piperidis

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
