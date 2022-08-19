def call(name, date) {
    sh "echo Hello ${name}. Today is ${date}."
}

def call(name) {
    sh "echo Hello ${name}."
}
