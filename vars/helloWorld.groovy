def call(name, date="Friday") {
    sh "echo Hello ${NODE_NAME}. Today is ${date}."
}
