# jtemplate

Template repository for java projects.

## Workflows

Repository includes ready-to-use [GitHub Workflows specs](https://docs.github.com/en/actions/writing-workflows).

### Build workflow

Build workflow triggers during the opening of the pull-request into main branch.
It checks that your project compiles successfully and passes all tests.

Specs:
- [build spec](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/build.yaml)
- [assemble jobs](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/assemble-jobs.yaml)
- [test jobs](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/test-jobs.yaml)

### Release workflows

You can manually trigger release workflows by selecting a branch and release type (patch, minor or major changes).
Release workflows includes three parts:
1. Prepare release
    - Updates a `CHANGELOG.md` and manifest files by converting the `## [Unreleased]` section to the latest release number.
    - Creates new `release/*` branch with latest release number
    - Opens pull-request into main branch
2. Draft release
    - Creates a release when the pull-request has been merged
3. Publish release
    - Updates refs after release is publishing

Requirements:
- `ACCESS_ID` secret - GitHub App ID
- `ACCESS_PRIVATE_KEY` secret - GitHub App private key

Specs:
- [prepare release spec](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/prepare-release.yaml)
- [draft release spec](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/draft-release.yaml)
- [publish release spec](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/publish-release.yaml)
- [open release pull-request jobs](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/release-pr-jobs.yaml)
- [create draft release jobs](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/draft-release-jobs.yaml)
- [update refs jobs](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/update-refs-jobs.yaml)

## References

- [GitHub Actions Marketplace](https://github.com/marketplace?type=actions)
- [GitHub Actions Documentation](https://docs.github.com/en/free-pro-team@latest/actions)
- [GitHub App token](https://github.com/marketplace/actions/github-app-token)
- [Keep-a-Changelog Action](https://github.com/marketplace/actions/keep-a-changelog-action)
