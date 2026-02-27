# FPL-Pulse
FPL live game week event streaming and mini-league tracker


## What I'm building

A system that polls the FPL API every 60 seconds during a gameweek, detects player stat changes (goals, assists, cards, bonus points), publishes them as typed events to Kafka, and uses consumers to compute live mini-league standings that get pushed to a browser in real time.

## Decisions I made

I decided to use Spring WebClient instead of RestTemplate
1. Modern way of calling Rest APIs
2. Allows asynchronous, and synchronous
3. This project has multiple things happening at once and we don't want blocking