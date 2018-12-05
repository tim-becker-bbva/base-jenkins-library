def call() {
  echo env.BRANCH_NAME
  switch(env.BRANCH_NAME) {
    case 'master':
    case 'develop':
    case ~/^feature\/.+$/:
    case ~/^release\/.+$/:
    case ~/^hotfix\/.+$/:
      break
    default:
      error("invalid branch name")
  }
}

return this