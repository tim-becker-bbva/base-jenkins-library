def call() {
    if(env.BRANCH_NAME == 'master') {
      error("Your builds don't deserve to pass")
    }
}

return this