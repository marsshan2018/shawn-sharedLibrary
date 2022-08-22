def call(name, date) {
    def localhostname = java.net.InetAddress.getLocalHost().getHostName();
    sh "echo Hello ${localhostname}. Today is ${date}."
}

def call(name) {
    sh "echo Hello ${NODE_NAME}."
}
