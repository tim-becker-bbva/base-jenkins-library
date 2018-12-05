def build() {
  // Fully reset the build environment to its default clean state.
  deleteDir()

  // Pull the latest source code from the Source Control Management (SCM) system.
  checkout scm

  // Recompile all software components and durable storage migrations.
  sh 'make build'
}

def test() {
  sh 'make test'
}

def analyzeTest() {
  junit 'target/surefire-reports/**/*.xml'
}

return this
