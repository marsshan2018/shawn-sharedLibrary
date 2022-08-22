@Field String localhostname = java.net.InetAddress.getLocalHost().getHostName();

def call(name, date) {
    sh "echo Hello ${localhostname}. Today is ${date}."
}

def call(name) {
    sh "echo Hello ${localhostname}."
}
