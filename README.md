# CroCroBot

Forked from https://github.com/Wyrdix/KholloBot

## Build and run
To compile this project, use `gradle clean shadowJar`.
Be aware that to compile and run this project successfully, a `login.json` file must be placed in `src/main/resources/login.json`.

The command will produce a runnable jar.

## Login
For the moment, the structure of the login.json file is as follows: `
{
  "discord_token": "[your bot token]"
}
`
You'll need to fill at least the discord bot token.
