package gg.jte.generated.ondemand;
public final class JtesecureGenerated {
	public static final String JTE_NAME = "secure.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,2,2,3,3,12,12,12,24,24,24,31,31,31,31,31,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String username) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtedefaultGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <div class=\"min-h-screen bg-gray-100\">\r\n        <nav class=\"bg-white shadow-sm\">\r\n            <div class=\"max-w-7xl mx-auto px-4 sm:px-6 lg:px-8\">\r\n                <div class=\"flex justify-between h-16\">\r\n                    <div class=\"flex items-center\">\r\n                        <h1 class=\"text-xl font-semibold\">Dashboard</h1>\r\n                    </div>\r\n                    <div class=\"flex items-center space-x-4\">\r\n                        <span class=\"text-gray-700\">Welcome, ");
				jteOutput.setContext("span", null);
				jteOutput.writeUserContent(username);
				jteOutput.writeContent("</span>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </nav>\r\n        <main class=\"max-w-7xl mx-auto py-6 sm:px-6 lg:px-8\">\r\n            <div class=\"px-4 py-6 sm:px-0\">\r\n                <div class=\"bg-white shadow rounded-lg p-6\">\r\n                    <h2 class=\"text-2xl font-semibold text-gray-800 mb-4\">User Information</h2>\r\n                    <div class=\"space-y-4\">\r\n                        <div>\r\n                            <p class=\"text-sm font-medium text-gray-500\">Username</p>\r\n                            <p class=\"mt-1 text-lg text-gray-900\">");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(username);
				jteOutput.writeContent("</p>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </main>\r\n    </div>\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String username = (String)params.getOrDefault("username", "");
		render(jteOutput, jteHtmlInterceptor, username);
	}
}
