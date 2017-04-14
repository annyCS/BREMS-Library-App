export interface User {
  id?: number;
  name: string;
  passwordHash?: string;
  dni: string;
  firstName: string;
  lastName1: string;
  lastName2: string;
  email: string;
  telephone: string;
  address?: string;
  biography?: string;
  literaryHobby?: string[];
  roles?: string[];
  hasPhoto?: boolean;
}
