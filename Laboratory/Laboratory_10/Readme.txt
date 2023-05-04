1. To efficiently manage (from a memory point of view) scenarios in which players interact with multiple computer-controlled characters find a solution based on:
- the collection of computer-coordinated characters contains elements of the same kind (the same 3D models)
- the space occupied by a 3D model is significant
- generating such a scenario requires a significant memory space for the client
- 3D models are displayed on the screen at different coordinates and can have textures of different colors
- an efficient solution must be found regarding the management of these situations



2. The game has an internal chat and players can send messages to others
- we want to filter comments / messages that are not appropriate; those messages will be dropped and not sent
- the chat server is managed by a different company and we don't have access to the source code