# jtemplate

Template repository for java projects.

## Workflows

Repository includes ready-to-use [GitHub-Workflows specs](https://docs.github.com/en/actions/writing-workflows).

### Build workflow

Build workflow triggers during the opening of the pull-request into main branch.
It checks that your project compiles successfully and passes all tests.

Configuration:
- [build spec](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/build.yaml)
- [assemble job spec](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/assemble-job.yaml)
- [test job spec](https://github.com/makeitvsolo/jtemplate/blob/main/.github/workflows/test-job.yaml)
