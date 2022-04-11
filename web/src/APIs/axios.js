import axios from 'axios';

const instance = axios.create({
  baseURL: 'https://kr.api.riotgames.com',
  params: {
    api_key: 'RGAPI-b25b7a84-53d1-4a07-b95b-0e12d09d490c',
  },
});

export default instance;