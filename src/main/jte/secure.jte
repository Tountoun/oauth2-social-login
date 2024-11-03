@param String username = ""

@template.layout.default(
content = @`
    <div class="min-h-screen bg-gray-100">
        <nav class="bg-white shadow-sm">
            <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
                <div class="flex justify-between h-16">
                    <div class="flex items-center">
                        <h1 class="text-xl font-semibold">Dashboard</h1>
                    </div>
                    <div class="flex items-center space-x-4">
                        <span class="text-gray-700">Welcome, ${username}</span>
                    </div>
                </div>
            </div>
        </nav>
        <main class="max-w-7xl mx-auto py-6 sm:px-6 lg:px-8">
            <div class="px-4 py-6 sm:px-0">
                <div class="bg-white shadow rounded-lg p-6">
                    <h2 class="text-2xl font-semibold text-gray-800 mb-4">User Information</h2>
                    <div class="space-y-4">
                        <div>
                            <p class="text-sm font-medium text-gray-500">Username</p>
                            <p class="mt-1 text-lg text-gray-900">${username}</p>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
`)