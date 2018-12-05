def call() {
  echo 'Branch name:' + env.BRANCH_NAME
  switch(env.BRANCH_NAME) {
    case 'master':
    case 'develop':
    case ~/^feature\/.+$/:
    case ~/^release\/.+$/:
    case ~/^hotfix\/.+$/:
      break
    default:
      error("Invalid branch name")
  }
}

return this