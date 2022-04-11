import axios from 'axios';

const instance = axios.create({
  baseURL: 'https://kr.api.riotgames.com',
  params: {
    api_key: 'RGAPI-f532addb-a74f-4626-96fa-be93d239f67b',
  },
});

export default instance;