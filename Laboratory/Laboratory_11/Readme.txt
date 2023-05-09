1. In order to allow other companies or players to develop external solutions that connect to the game, a library (an API) must be developed.
- The API contains many classes with many details
- not all classes are documented
- The API should provide a simplified interface for a set of basic functions

2. During the game the client may lose the connection to the server (for various reasons). When this happens,the different modules in the game must react accordingly
- the game instance must be saved on the client
- character attributes must be saved
- the gamer must be notified
- the connection must be retried


3. Create the possibility that the players and the game should be able to handle groups of characters
- multiple players or NPCs can be grouped together
- groups can grow by including other groups or individual characters
- some characters can control groups

