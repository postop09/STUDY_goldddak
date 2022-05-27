# goldddak
From Bronze To Gold, 브실골이여 고개를 들어라,,, 승리를 쟁취하라,,

## Asset/Convention
![BSG 기획](https://user-images.githubusercontent.com/93017923/162559856-be90150a-94ed-430a-8bee-8875f5f44670.PNG)


### 사용 API
- [Riot API key 발급](https://developer.riotgames.com/)

- 조건에 해당하는 소환사 정보 (**LEAGUE-V4**)  `/lol/league/v4/entries/{queue}/{tier}/{division}`
![image](https://user-images.githubusercontent.com/93017923/162560316-cc684ee9-2350-4f37-bf48-f70555a2926f.png)

- 각 소환사의 puuid 획득 (**SUMMONER-V4**)  `/lol/summoner/v4/summoners/by-name/{summonerName}`
![image](https://user-images.githubusercontent.com/93017923/162560356-d475608c-3f94-493e-9bbf-58a000534f84.png)

- 소환사의 최근 10게임 matchid 획득 (**MATCH-V5**)  `/lol/match/v5/matches/by-puuid/{puuid}/ids`
![image](https://user-images.githubusercontent.com/93017923/162560374-5a2c4177-456e-49f0-bfcb-0a3c455a4c40.png)

- matchid를 통해 게임 정보 획득  (**MATCH-V5**)  `/lol/match/v5/matches/{matchId}`
![image](https://user-images.githubusercontent.com/93017923/162560381-ebffec1a-8f61-4aac-930d-6b13f4e53989.png)
